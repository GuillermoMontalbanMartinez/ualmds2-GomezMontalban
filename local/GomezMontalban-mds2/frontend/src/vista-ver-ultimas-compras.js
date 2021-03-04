import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-productos-comprados-recientemente.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaVerUltimasCompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: flex-start;">
 <h2>Últimas compras realizadas</h2>
</vaadin-vertical-layout>
<vista-productos-comprados-recientemente style="width: 100%; height: 100%;"></vista-productos-comprados-recientemente>
`;
    }

    static get is() {
        return 'vista-ver-ultimas-compras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerUltimasCompras.is, VistaVerUltimasCompras);
