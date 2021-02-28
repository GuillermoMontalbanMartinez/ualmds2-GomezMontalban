import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-compra-enviada`
 *
 * VistaCompraEnviada element.
 *
 * @customElement
 * @polymer
 */
class VistaCompraEnviada extends PolymerElement {

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
        return 'vista-compra-enviada';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCompraEnviada.is, VistaCompraEnviada);
