import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-mostrar-fecha-limite`
 *
 * VistaMostrarFechaLimite element.
 *
 * @customElement
 * @polymer
 */
class VistaMostrarFechaLimite extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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