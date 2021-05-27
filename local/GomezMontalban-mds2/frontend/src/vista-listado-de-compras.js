import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-compras-admin.js';

class VistaListadoDeCompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: center; justify-content: center; width: 100%;" id="vaadinVerticalLayoutListadoDeCompras">
 <h1>Listado de compras</h1>
</vaadin-vertical-layout>
<vaadin-vertical-layout id="verticalLayoutVistaComprasAdmin" style="width: 100%; height: 100%;">
 <vista-compras-admin id="layoutVistaComprasAdmin"></vista-compras-admin>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-listado-de-compras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListadoDeCompras.is, VistaListadoDeCompras);
