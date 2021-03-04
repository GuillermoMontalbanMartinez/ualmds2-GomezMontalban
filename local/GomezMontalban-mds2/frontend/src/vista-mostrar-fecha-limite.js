import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaMostrarFechaLimite extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout>
 <p style="align-self: center; flex-shrink: 0;">Paragraph</p>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-mostrar-fecha-limite';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMostrarFechaLimite.is, VistaMostrarFechaLimite);
